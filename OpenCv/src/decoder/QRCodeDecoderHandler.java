package decoder;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import jp.sourceforge.qrcode.QRCodeDecoder;
import jp.sourceforge.qrcode.data.QRCodeImage;
import jp.sourceforge.qrcode.exception.DecodingFailedException;

/**
 * @blog http://sjsky.iteye.com
 * @author Michael
 */

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class QRCodeDecoderHandler extends ActionSupport {
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
		BufferedImage bufImg = null;
		try {
			bufImg = ImageIO.read(image);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		QRCodeDecoder decoder = new QRCodeDecoder();
		String decodedData = new String(decoder.decode(new J2SEImage(bufImg)));

		request.setAttribute("decodeResult", decodedData);
		System.out.println("========decoder success!!!");
		return "success";// ｸﾝﾅ葷ﾃﾎﾄｼ�ﾌｪｵｽmain.jspﾒｳﾃ�
	}

	/**
	 * @param argsthe
	 *            command line arguments
	 */

	class J2SEImage implements QRCodeImage
	{ 
       BufferedImage bufImg;

		public J2SEImage(BufferedImage bufImg) { 
           this.bufImg = bufImg; 
       }

		public int getWidth() {
			return bufImg.getWidth();
		}

		public int getHeight() {
			return bufImg.getHeight();
		}

		public int getPixel(int x, int y) {
			return bufImg.getRGB(x, y);
		}

	}
}