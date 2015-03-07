package uniandes.cupi2.biblioteca.interfaz;


/** 
 * Panel de control de la aplicaci�n.
 */
public class PanelAccionesContenedora extends javax.swing.JPanel {
    /** 
     * Constante para la serializaci�n.
     */
    private static final long serialVersionUID = 1L;
    
    /** 
     * Interfaz principal de la aplicaci�n.
     */
    private uniandes.cupi2.biblioteca.interfaz.InterfazBiblioteca principal;
    
    /** 
     * Panel donde se hacen las principales acciones que tienen que ver con el manejo de usuario de la aplicaci�n.
     */
    private uniandes.cupi2.biblioteca.interfaz.PanelAcciones panelAcciones;
    
    /** 
     * Panel donde se hacen las principales acciones que tienen que ver con el manejo de libros de la aplicaci�n.
     */
    private uniandes.cupi2.biblioteca.interfaz.PanelAccionesUsuario panelAccionesUsuario;
    
    /** 
     * Layout del panel.
     */
    private java.awt.CardLayout cartas;
    
    /** 
     * Constructor por defecto del panel.
     */
    public PanelAccionesContenedora(uniandes.cupi2.biblioteca.interfaz.InterfazBiblioteca laInterfaz) {
        principal = laInterfaz;
        setSize(244 ,378);
        cartas = new java.awt.CardLayout();
        setLayout(cartas);
        setPreferredSize(new java.awt.Dimension(244 , 378));
        setMaximumSize(new java.awt.Dimension(244 , 378));
        setMinimumSize(new java.awt.Dimension(244 , 378));
        panelAcciones = new uniandes.cupi2.biblioteca.interfaz.PanelAcciones(principal);
        panelAcciones.setName("panelAcciones");
        add(panelAcciones ,"ACCIONES");
    }
    
    /** 
     * Acci�n que se hace despu�s de la autenticaci�n. Se cambia el panel de las acciones que manejan usuario por las acciones que manejan libros.
     * @param nombre Nombre del usuario que se autentic�.
     * @param biblioteca Biblioteca.
     * @param total N�mero total de libros.
     * @param prestados N�mero total de libros que est�n en pr�stamo.
     */
    public void login(java.lang.String nombre, uniandes.cupi2.biblioteca.mundo.AbstractBiblioteca biblioteca, int total, int prestados) {
        panelAccionesUsuario = new uniandes.cupi2.biblioteca.interfaz.PanelAccionesUsuario(principal , nombre , total , prestados , biblioteca);
        add(panelAccionesUsuario ,"USUARIO");
        cartas.show(this ,"USUARIO");
    }
    
    /** 
     * Acci�n que se hace despu�s hacer log out. Se cambia el panel de las acciones que manejan libros por las acciones que manejan usuarios.
     */
    public void salir() {
        cartas.show(this ,"ACCIONES");
    }
    
}

