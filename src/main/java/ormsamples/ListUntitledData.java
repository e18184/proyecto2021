/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListUntitledData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing V_usuariorol...");
		com.example.demo.modelo.V_usuariorol[] comexampledemomodeloV_usuariorols = com.example.demo.modelo.V_usuariorolDAO.listV_usuariorolByQuery(null, null);
		int length = Math.min(comexampledemomodeloV_usuariorols.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comexampledemomodeloV_usuariorols[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
				
	}
	
	public static void main(String[] args) {
		try {
			ListUntitledData listUntitledData = new ListUntitledData();
			try {
				listUntitledData.listTestData();
			}
			finally {
				com.example.demo.modelo.UntitledPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
