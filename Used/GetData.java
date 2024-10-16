import javax.swing.JOptionPane;

class GetData
{
     static double getDouble(String s)
     {
          return Double.parseDouble(getString(s));	
     }

     static int getInt(String s)
     {
          return Integer.parseInt( getString(s));	
    }
    static String getString(String s)
    {
           return JOptionPane.showInputDialog(s);
    }	
}