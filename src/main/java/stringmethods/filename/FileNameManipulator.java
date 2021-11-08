package stringmethods.filename;

import java.util.Locale;

public class FileNameManipulator {
    public char findLastCharacter(String str) {
        str = str.trim();
        return str.charAt(str.length() - 1);
    }

    public String findFileExtension(String fileName) {
        fileName = fileName.trim();
        if (fileName.lastIndexOf(".") >= 0) {
            return fileName.substring(fileName.lastIndexOf("."));
        }
        return "there is no";
    }

    public boolean identifyFilesByExtension(String ext, String filename) {
        ext = ext.trim();
        filename = filename.trim();
        return filename.endsWith(ext);
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        searchedFileName = searchedFileName.trim();
        actualFileName = actualFileName.trim();
        return searchedFileName.equalsIgnoreCase(actualFileName);
    }
    public String changeExtensionToLowerCase(String fileName){
        int dotIndex;
        dotIndex = fileName.lastIndexOf(".");
        String tempExt="";
        tempExt= fileName.substring(dotIndex);
        fileName= fileName.substring(0,dotIndex);
        fileName= fileName + tempExt.toLowerCase(Locale.ROOT);
        return fileName.trim();
    }
    public String replaceStringPart(String fileName, String present, String target){

        if (fileName.contains(present)==true){

            fileName=fileName.replace(present,target);

        } else return "nincs benne";

    return fileName;}

    public static void main(String[] args) {
        FileNameManipulator fm = new FileNameManipulator();
//        System.out.println(fm.findLastCharacter("tetu "));
//        System.out.println(fm.findFileExtension("neverletme.go "));
//        System.out.println(fm.identifyFilesByExtension("txt", "neverletmego.txt"));
//        System.out.println(fm.compareFilesByName("neverletmego.txt", "neverletmego.txt" +
//                ""));
//        System.out.println(fm.changeExtensionToLowerCase("   noob.TXT  "));
        ;
        System.out.println(fm.replaceStringPart("neverletmegobabe","letmego","go"));
    }
}
