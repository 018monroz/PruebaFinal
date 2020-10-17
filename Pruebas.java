public class Pruebas{
    public static void main(String args[]){

        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv"); //Archivo es el documento con comasd
        System.out.println(archivox[1]);

        for(int n=0;n<500;n++){ 
        String[] archivo = archivox[n].split(";"); // Archivox es el documento sin comas
            for(int i=0;i<archivo.length;i++){
                System.out.print(archivo[i]);
            }
        System.out.println();
        }
    }
}
