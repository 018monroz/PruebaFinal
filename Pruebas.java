public class Pruebas{

    public static void  gran_Breta(){
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

            for(int n=0;n<20;n++){
                String[] archivo = archivox[n].split(";"); // Archivox es el documento sin comas
                for(int i=0;i<archivo.length;i++){
                    switch (archivo[i]){
                        case "1":
                            System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
                            break;
                        case "2":
                            System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
                            break;
                        case "3":
                            System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
                            break;
                        default:
                            System.out.print("   ");
                }
                System.out.print(ConsoleColors.RESET);
             
            }
                System.out.println();   
        }
    }







    }


