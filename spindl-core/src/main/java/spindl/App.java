package spindl;

/**
 * Hello world!
 *
 */


public class App 
{
    public String extractExtensionFromArgFile(String fileName)
    {
        
        String[] names = fileName.split("\\.(?=[^\\.]+$)");
        String fileExtension = names[1];
        //System.out.println(fileExtension);

        // for (int i = 0; i < names.length; i++) {
        //     System.out.println("arg " + i + ": " + names[i]);
        // }
        return fileExtension;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        for (int i = 0; i < args.length; i++) {
            System.out.println("arg " + i + ": " + args[i]);
        }
        
        App myApp = new App(); //that's nutty
        
        if (args.length > 0 && args[0].contains(".")) {
            String fileName = args[0];
            String fileExtension = myApp.extractExtensionFromArgFile(fileName);
            System.out.println(fileExtension);
        }
    }
	
	public static String needle(String input)
	{
		input = input+("needle");
		return input;
	}
}
