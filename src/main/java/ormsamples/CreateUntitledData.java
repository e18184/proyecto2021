/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateUntitledData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = com.example.demo.modelo.UntitledPersistentManager.instance().getSession().beginTransaction();
		try {
			com.example.demo.modelo.Areas lcomexampledemomodeloAreas = com.example.demo.modelo.AreasDAO.createAreas();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : textos, estado, nombre
			com.example.demo.modelo.AreasDAO.save(lcomexampledemomodeloAreas);
			com.example.demo.modelo.Autores lcomexampledemomodeloAutores = com.example.demo.modelo.AutoresDAO.createAutores();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : codt, nombre
			com.example.demo.modelo.AutoresDAO.save(lcomexampledemomodeloAutores);
			com.example.demo.modelo.Datos lcomexampledemomodeloDatos = com.example.demo.modelo.DatosDAO.createDatos();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mprestamo, codper, ci
			com.example.demo.modelo.DatosDAO.save(lcomexampledemomodeloDatos);
			com.example.demo.modelo.Dprestamo lcomexampledemomodeloDprestamo = com.example.demo.modelo.DprestamoDAO.createDprestamo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estado
			com.example.demo.modelo.DprestamoDAO.save(lcomexampledemomodeloDprestamo);
			com.example.demo.modelo.Editoriales lcomexampledemomodeloEditoriales = com.example.demo.modelo.EditorialesDAO.createEditoriales();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : textos, estado, nombre
			com.example.demo.modelo.EditorialesDAO.save(lcomexampledemomodeloEditoriales);
			com.example.demo.modelo.Ejemplares lcomexampledemomodeloEjemplares = com.example.demo.modelo.EjemplaresDAO.createEjemplares();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : dprestamo, codd, per_resp, codt, estado, disponible
			com.example.demo.modelo.EjemplaresDAO.save(lcomexampledemomodeloEjemplares);
			com.example.demo.modelo.Mdevol lcomexampledemomodeloMdevol = com.example.demo.modelo.MdevolDAO.createMdevol();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : codinv, codp, login, estado, fecha
			com.example.demo.modelo.MdevolDAO.save(lcomexampledemomodeloMdevol);
			com.example.demo.modelo.Menus lcomexampledemomodeloMenus = com.example.demo.modelo.MenusDAO.createMenus();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : codp, codr, estado, nombre
			com.example.demo.modelo.MenusDAO.save(lcomexampledemomodeloMenus);
			com.example.demo.modelo.Mprestamo lcomexampledemomodeloMprestamo = com.example.demo.modelo.MprestamoDAO.createMprestamo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mdevol, dprestamo, login, ci, estado, tipopres, ffin, fini, fecha
			com.example.demo.modelo.MprestamoDAO.save(lcomexampledemomodeloMprestamo);
			com.example.demo.modelo.Personas lcomexampledemomodeloPersonas = com.example.demo.modelo.PersonasDAO.createPersonas();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuarios, telefonos, datos, tipoper, estado, genero, nombre
			com.example.demo.modelo.PersonasDAO.save(lcomexampledemomodeloPersonas);
			com.example.demo.modelo.Procesos lcomexampledemomodeloProcesos = com.example.demo.modelo.ProcesosDAO.createProcesos();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : codm, estado, enlace, nombre
			com.example.demo.modelo.ProcesosDAO.save(lcomexampledemomodeloProcesos);
			com.example.demo.modelo.Roles lcomexampledemomodeloRoles = com.example.demo.modelo.RolesDAO.createRoles();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : login, codm, estado, nombre
			com.example.demo.modelo.RolesDAO.save(lcomexampledemomodeloRoles);
			com.example.demo.modelo.Telefonos lcomexampledemomodeloTelefonos = com.example.demo.modelo.TelefonosDAO.createTelefonos();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : numero
			com.example.demo.modelo.TelefonosDAO.save(lcomexampledemomodeloTelefonos);
			com.example.demo.modelo.Textos lcomexampledemomodeloTextos = com.example.demo.modelo.TextosDAO.createTextos();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tipotext, ejemplares, coda1, code, coda, titulo
			com.example.demo.modelo.TextosDAO.save(lcomexampledemomodeloTextos);
			com.example.demo.modelo.Tipos lcomexampledemomodeloTipos = com.example.demo.modelo.TiposDAO.createTipos();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tipotext, sw, estado, nombre
			com.example.demo.modelo.TiposDAO.save(lcomexampledemomodeloTipos);
			com.example.demo.modelo.Tipotext lcomexampledemomodeloTipotext = com.example.demo.modelo.TipotextDAO.createTipotext();
			// Initialize the properties of the persistent object here
			com.example.demo.modelo.TipotextDAO.save(lcomexampledemomodeloTipotext);
			com.example.demo.modelo.Usuarios lcomexampledemomodeloUsuarios = com.example.demo.modelo.UsuariosDAO.createUsuarios();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mprestamo, mdevol, ejemplares, codr, codper, estado, passwd, login
			com.example.demo.modelo.UsuariosDAO.save(lcomexampledemomodeloUsuarios);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateUntitledData createUntitledData = new CreateUntitledData();
			try {
				createUntitledData.createTestData();
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
