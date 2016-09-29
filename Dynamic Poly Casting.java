class ElectronicDevice
{
public void Ipad()                 
{
System.out.println("Game");
}
public void Remote()              
{
System.out.println("Change");
}
public void Ipod()               
{
System.out.println("Songs");
     }
}

class TV extends ElectronicDevice
{
public void Video()
{
System.out.println("can watch");
}
public void Remote()
{
System.out.println("A-remote");
    }
}

class Radio extends ElectronicDevice
{
public void Audio()
{
System.out.println("can hear");
}
public void Remote()
{
System.out.println("B-remote");
    }
}


class Device1
{
public static void main(String arg[])
{

ElectronicDevice E = new TV();
E.Remote();
TV T = (TV)E;
T.Video();
T.Ipod();
T.Ipad(); 

   }
}




