/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateUntitledData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = com.example.demo.modelo.UntitledPersistentManager.instance().getSession().beginTransaction();
		try {
			com.example.demo.modelo.V_usuariorol lcomexampledemomodeloV_usuariorol = com.example.demo.modelo.V_usuariorolDAO.loadV_usuariorolByQuery(null, null);
			com.example.demo.modelo.Areas lcomexampledemomodeloAreas = com.example.demo.modelo.AreasDAO.loadAreasByQuery(null, null);
			// Update the properties of the persistent object
			com.example.demo.modelo.AreasDAO.save(lcomexampledemomodeloAreas);
			com.example.demo.modelo.Autores lcomexampledemomodeloAutores = com.example.demo.modelo.AutoresDAO.loadAutoresByQuery(null, null);
			// Update the properties of the persistent object
			com.example.demo.modelo.AutoresDAO.save(lcomexampledemomodeloAutores);
			com.example.demo.modelo.Datos lcomexampledemomodeloDatos = com.example.demo.modelo.DatosDAO.loadDatosByQuery(null, null);
			// Update the properties of the persistent object
			com.example.demo.modelo.DatosDAO.save(lcomexampledemomodeloDatos);
			com.example.demo.modelo.Dprestamo lcomexampledemomodeloDprestamo = com.example.demo.modelo.DprestamoDAO.loadDprestamoByQuery(null, null);
			// Update the properties of the persistent object
			com.example.demo.modelo.DprestamoDAO.save(lcomexampledemomodeloDprestamo);
			com.example.demo.modelo.Editoriales lcomexampledemomodeloEditoriales = com.example.demo.modelo.EditorialesDAO.loadEditorialesByQuery(null, null);
			// Update the properties of the persistent object
			com.example.demo.modelo.EditorialesDAO.save(lcomexampledemomodeloEditoriales);
			com.example.demo.modelo.Ejemplares lcomexampledemomodeloEjemplares = com.example.demo.modelo.EjemplaresDAO.loadEjemplaresByQuery(null, null);
			// Update the properties of the persistent object
			com.example.demo.modelo.EjemplaresDAO.save(lcomexampledemomodeloEjemplares);
			com.example.demo.modelo.Mdevol lcomexampledemomodeloMdevol = com.example.demo.modelo.MdevolDAO.loadMdevolByQuery(null, null);
			// Update the properties of the persistent object
			com.example.demo.modelo.MdevolDAO.save(lcomexampledemomodeloMdevol);
			com.example.demo.modelo.Menus lcomexampledemomodeloMenus = com.example.demo.modelo.MenusDAO.loadMenusByQuery(null, null);
			// Update the properties of the persistent object
			com.example.demo.modelo.MenusDAO.save(lcomexampledemomodeloMenus);
			com.example.demo.modelo.Mprestamo lcomexampledemomodeloMprestamo = com.example.demo.modelo.MprestamoDAO.loadMprestamoByQuery(null, null);
			// Update the properties of the persistent object
			com.example.demo.modelo.MprestamoDAO.save(lcomexampledemomodeloMprestamo);
			com.example.demo.modelo.Personas lcomexampledemomodeloPersonas = com.example.demo.modelo.PersonasDAO.loadPersonasByQuery(null, null);
			// Update the properties of the persistent object
			com.example.demo.modelo.PersonasDAO.save(lcomexampledemomodeloPersonas);
			com.example.demo.modelo.Procesos lcomexampledemomodeloProcesos = com.example.demo.modelo.ProcesosDAO.loadProcesosByQuery(null, null);
			// Update the properties of the persistent object
			com.example.demo.modelo.ProcesosDAO.save(lcomexampledemomodeloProcesos);
			com.example.demo.modelo.Roles lcomexampledemomodeloRoles = com.example.demo.modelo.RolesDAO.loadRolesByQuery(null, null);
			// Update the properties of the persistent object
			com.example.demo.modelo.RolesDAO.save(lcomexampledemomodeloRoles);
			com.example.demo.modelo.Telefonos lcomexampledemomodeloTelefonos = com.example.demo.modelo.TelefonosDAO.loadTelefonosByQuery(null, null);
			// Update the properties of the persistent object
			com.example.demo.modelo.TelefonosDAO.save(lcomexampledemomodeloTelefonos);
			com.example.demo.modelo.Textos lcomexampledemomodeloTextos = com.example.demo.modelo.TextosDAO.loadTextosByQuery(null, null);
			// Update the properties of the persistent object
			com.example.demo.modelo.TextosDAO.save(lcomexampledemomodeloTextos);
			com.example.demo.modelo.Tipos lcomexampledemomodeloTipos = com.example.demo.modelo.TiposDAO.loadTiposByQuery(null, null);
			// Update the properties of the persistent object
			com.example.demo.modelo.TiposDAO.save(lcomexampledemomodeloTipos);
			com.example.demo.modelo.Tipotext lcomexampledemomodeloTipotext = com.example.demo.modelo.TipotextDAO.loadTipotextByQuery(null, null);
			// Update the properties of the persistent object
			com.example.demo.modelo.TipotextDAO.save(lcomexampledemomodeloTipotext);
			com.example.demo.modelo.Usuarios lcomexampledemomodeloUsuarios = com.example.demo.modelo.UsuariosDAO.loadUsuariosByQuery(null, null);
			// Update the properties of the persistent object
			com.example.demo.modelo.UsuariosDAO.save(lcomexampledemomodeloUsuarios);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateUntitledData retrieveAndUpdateUntitledData = new RetrieveAndUpdateUntitledData();
			try {
				retrieveAndUpdateUntitledData.retrieveAndUpdateTestData();
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
