package opencv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

@SuppressWarnings("serial")
public class OCR extends ActionSupport {
	private File image;// ｶﾔﾓｦﾇｰｶﾋｱ昉･ﾖﾐﾌ眇ｻ name="image"
	private String imageContentType;
	private String imageFileName;

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getImageContentType() {
		return imageContentType;
	}

	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}

	private String contentType = "text/html;charset=utf-8";

	public String myExecute() {
		HttpServletRequest request = ServletActionContext.getRequest();
		if (image != null) {
	        ITesseract instance = new Tesseract();  // JNA Interface Mapping
	        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping

	        try {
	        	instance.setDatapath("E:\\workspace\\OpenCv");
	        	instance.setLanguage("jpn");
	        	File myfile = new File("E:\\workspace\\OpenCv\\WebContent\\temp.jpg");
	        	try {
					FileUtils.copyFile(image, myfile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	System.out.print(myfile.getName());
	            String result = instance.doOCR(myfile);
	            System.out.print(result);
	            request.setAttribute("ocr_result", result);
	        } catch (TesseractException e) {
	            System.err.println(e.getMessage());
	        }
		}
		return "success";// ｸﾝﾅ葷ﾃﾎﾄｼ�ﾌｪｵｽmain.jspﾒｳﾃ�
	}
}