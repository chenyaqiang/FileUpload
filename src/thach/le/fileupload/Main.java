/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thach.le.fileupload;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

/**
 *
 * @author thachlp
 */
public class Main {

	public static void main(String[] args) throws Exception {
		Server server = new Server(7070);
		ServletContextHandler handler = new ServletContextHandler(server, "/*");
		handler.addServlet(UploadFileDashboard.class, "/fileupload");
		handler.addServlet(UploadFileController.class, "/fileupload/ajax");

		server.start();
	}

}
