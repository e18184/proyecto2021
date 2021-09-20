/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteUntitledData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = com.example.demo.modelo.UntitledPersistentManager.instance().getSession().beginTransaction();
		try {
			com.example.demo.modelo.Areas lcomexampledemomodeloAreas = com.example.demo.modelo.AreasDAO.loadAreasByQuery(null, null);
			// Delete the persistent object
			com.example.demo.modelo.AreasDAO.delete(lcomexampledemomodeloAreas);
			com.example.demo.modelo.Autores lcomexampledemomodeloAutores = com.example.demo.modelo.AutoresDAO.loadAutoresByQuery(null, null);
			// Delete the persistent object
			com.example.demo.modelo.AutoresDAO.delete(lcomexampledemomodeloAutores);
			com.example.demo.modelo.Datos lcomexampledemomodeloDatos = com.example.demo.modelo.DatosDAO.loadDatosByQuery(null, null);
			// Delete the persistent object
			com.example.demo.modelo.DatosDAO.delete(lcomexampledemomodeloDatos);
			com.example.demo.modelo.Dprestamo lcomexampledemomodeloDprestamo = com.example.demo.modelo.DprestamoDAO.loadDprestamoByQuery(null, null);
			// Delete the persistent object
			com.example.demo.modelo.DprestamoDAO.delete(lcomexampledemomodeloDprestamo);
			com.example.demo.modelo.Editoriales lcomexampledemomodeloEditoriales = com.example.demo.modelo.EditorialesDAO.loadEditorialesByQuery(null, null);
			// Delete the persistent object
			com.example.demo.modelo.EditorialesDAO.delete(lcomexampledemomodeloEditoriales);
			com.example.demo.modelo.Ejemplares lcomexampledemomodeloEjemplares = com.example.demo.modelo.EjemplaresDAO.loadEjemplaresByQuery(null, null);
			// Delete the persistent object
			com.example.demo.modelo.EjemplaresDAO.delete(lcomexampledemomodeloEjemplares);
			com.example.demo.modelo.Mdevol lcomexampledemomodeloMdevol = com.example.demo.modelo.MdevolDAO.loadMdevolByQuery(null, null);
			// Delete the persistent object
			com.example.demo.modelo.MdevolDAO.delete(lcomexampledemomodeloMdevol);
			com.example.demo.modelo.Menus lcomexampledemomodeloMenus = com.example.demo.modelo.MenusDAO.loadMenusByQuery(null, null);
			// Delete the persistent object
			com.example.demo.modelo.MenusDAO.delete(lcomexampledemomodeloMenus);
			com.example.demo.modelo.Mprestamo lcomexampledemomodeloMprestamo = com.example.demo.modelo.MprestamoDAO.loadMprestamoByQuery(null, null);
			// Delete the persistent object
			com.example.demo.modelo.MprestamoDAO.delete(lcomexampledemomodeloMprestamo);
			com.example.demo.modelo.Personas lcomexampledemomodeloPersonas = com.example.demo.modelo.PersonasDAO.loadPersonasByQuery(null, null);
			// Delete the persistent object
			com.example.demo.modelo.PersonasDAO.delete(lcomexampledemomodeloPersonas);
			com.example.demo.modelo.Procesos lcomexampledemomodeloProcesos = com.example.demo.modelo.ProcesosDAO.loadProcesosByQuery(null, null);
			// Delete the persistent object
			com.example.demo.modelo.ProcesosDAO.delete(lcomexampledemomodeloProcesos);
			com.example.demo.modelo.Roles lcomexampledemomodeloRoles = com.example.demo.modelo.RolesDAO.loadRolesByQuery(null, null);
			// Delete the persistent object
			com.example.demo.modelo.RolesDAO.delete(lcomexampledemomodeloRoles);
			com.example.demo.modelo.Telefonos lcomexampledemomodeloTelefonos = com.example.demo.modelo.TelefonosDAO.loadTelefonosByQuery(null, null);
			// Delete the persistent object
			com.example.demo.modelo.TelefonosDAO.delete(lcomexampledemomodeloTelefonos);
			com.example.demo.modelo.Textos lcomexampledemomodeloTextos = com.example.demo.modelo.TextosDAO.loadTextosByQuery(null, null);
			// Delete the persistent object
			com.example.demo.modelo.TextosDAO.delete(lcomexampledemomodeloTextos);
			com.example.demo.modelo.Tipos lcomexampledemomodeloTipos = com.example.demo.modelo.TiposDAO.loadTiposByQuery(null, null);
			// Delete the persistent object
			com.example.demo.modelo.TiposDAO.delete(lcomexampledemomodeloTipos);
			com.example.demo.modelo.Tipotext lcomexampledemomodeloTipotext = com.example.demo.modelo.TipotextDAO.loadTipotextByQuery(null, null);
			// Delete the persistent object
			com.example.demo.modelo.TipotextDAO.delete(lcomexampledemomodeloTipotext);
			com.example.demo.modelo.Usuarios lcomexampledemomodeloUsuarios = com.example.demo.modelo.UsuariosDAO.loadUsuariosByQuery(null, null);
			// Delete the persistent object
			com.example.demo.modelo.UsuariosDAO.delete(lcomexampledemomodeloUsuarios);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteUntitledData deleteUntitledData = new DeleteUntitledData();
			try {
				deleteUntitledData.deleteTestData();
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
