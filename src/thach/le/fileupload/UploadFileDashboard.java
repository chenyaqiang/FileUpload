/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thach.le.fileupload;

import hapax.TemplateLoader;
import hapax.Template;
import hapax.TemplateDataDictionary;
import hapax.TemplateDictionary;
import hapax.TemplateException;
import hapax.TemplateResourceLoader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpStatus;

/**
 *
 * @author thachlp
 */
public class UploadFileDashboard extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			resp.setStatus(HttpStatus.OK_200);
			//TemplateLoader load resource
			TemplateLoader templateLoader = TemplateResourceLoader.create("thach/le/views/");
			//Template load file
			Template template = templateLoader.getTemplate("upload_file.xtm");
			//Use TemplateDictionary to put to xtm
			TemplateDictionary templeDictionary = new TemplateDictionary();


			String data = template.renderToString(templeDictionary);
			resp.setContentType("text/html;charset=UTF-8");
			resp.getWriter().println(data);
		} catch (TemplateException ex) {
			Logger.getLogger(UploadFileDashboard.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
