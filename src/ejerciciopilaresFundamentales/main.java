package ejerciciopilaresFundamentales;
public class main {
    public static void main(String[] args) {
        System.out.println("Valores de ejemplos: ");
        System.out.println("Telefono");
        TelefonoMovil telefono = new TelefonoMovil();
        telefono.setCapacidadAlmacenamineto(1028);
        telefono.setDuracionBateria(24);
        telefono.setPrecio(11000.50);
        telefono.setMarca("APPLE");
        telefono.setModelo("IPhone 14");
        System.out.println("Almacenamiento: "+ telefono.getCapacidadAlmacenamineto()+" GB"
                + "\n"
                + "Duracio bateria: "+telefono.getDuracionBateria()+" horas"
                + "\n"
                + "Marca: "+telefono.getMarca()
                + "\n"
                + "Modelo: "+telefono.getModelo()
                + "\n"
                + "Precio: "+telefono.getPrecio());
        
        System.out.println("Tableta");
        Tableta tableta = new Tableta();
        tableta.setVelocidadProcessador("Kirin 710A GPU Mali G51");
        tableta.setTamanoPantalla(10.4);
        tableta.setResolucionPantalla("2.000 x 1.200 píxeles 470 nits");
        //tableta.setMarca("Huawei");
        tableta.setModelo("Huawei MatePad");
        tableta.setPrecio(18000);
        System.out.println("Procesador: "+tableta.getVelocidadProcessador()
                + "\n"
                + "Pantalla: "+tableta.getTamanoPantalla()
                + "\n"
                + "Resolucion: "+tableta.getResolucionPantalla()
                + "\n"
                + "Marca: "+tableta.getMarca()
                + "\n"
                + "Modelo: "+tableta.getModelo()
                + "\n"
                + "Precio: "+tableta.getPrecio());
        
                
        
    
    
    }
}
