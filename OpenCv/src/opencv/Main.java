package opencv;

import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.stream.FileImageInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class Main extends ActionSupport {
	private File image;// ｶﾔﾓｦﾇｰｶﾋｱ昉･ﾖﾐﾌ眇ｻ name="image"
	private String imageContentType;
	private String imageFileName;
	private ByteArrayInputStream inputStream;
	
    public ByteArrayInputStream getInputStream()
    {
        return inputStream;
    }

    public void setInputStream(ByteArrayInputStream inputStream)
    {
        this.inputStream = inputStream;
    }

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

			String fileName = "C:\\Users\\Administrator\\Desktop\\upload";		
			String extension = imageFileName.substring(imageFileName.indexOf("."));// ｻ｡ﾉﾏｴｫﾎﾄｼ�ｵﾄﾍﾘﾕｹﾃ�
			fileName = fileName + extension;

			System.out.println(fileName);
			File myfile = new File(fileName);
			try {
				FileUtils.copyFile(image, myfile);// ﾉﾏｴｫｵｽｿﾍｻｧｶﾋ
				File file = new File(
						"C:\\Users\\Administrator\\Desktop\\opencvtest.exe");
				Desktop.getDesktop().open(file);
//				Runtime.getRuntime().exec(file.getAbsolutePath());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileImageInputStream input = null;
		String resultNum = null;
		try {
			File txtResultFile = new File("C:\\Users\\Administrator\\Desktop\\result.txt");
			resultNum = readTxt(txtResultFile);
			input = new FileImageInputStream(new File("C:\\Users\\Administrator\\Desktop\\result.jpg"));
			byte[] buff = new byte[8000];
			int bytesRead = 0;
			ByteArrayOutputStream bao = new ByteArrayOutputStream();
			while((bytesRead = input.read(buff)) != -1) {
	             bao.write(buff, 0, bytesRead);
	        }
			byte[] data = bao.toByteArray();
			ByteArrayInputStream bin = new ByteArrayInputStream(data);
			this.setInputStream(bin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		File resultImage = new File("C:\\Users\\Administrator\\Desktop\\result.jpg");
		HttpSession session = request.getSession();
//		session.setAttribute("imagePath", "result.jpg");
		request.setAttribute("resultNum", resultNum);
		return "success";// ｸﾝﾅ葷ﾃﾎﾄｼ�ﾌｪｵｽmain.jspﾒｳﾃ�
	}
	
	private String readTxt(File file) throws Exception{
		InputStreamReader read = new InputStreamReader(new FileInputStream(file));
		BufferedReader bf = new BufferedReader(read);
		String lineTxt = bf.readLine();
		read.close();
		return lineTxt;
	}
}