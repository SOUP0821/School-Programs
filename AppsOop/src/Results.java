
class Apps
{

  public String name;
  public int downloads;

  public Apps(String name, int downloads)
  {
    this.name = name;
    this.downloads = downloads;
  }

  public Apps()
  {
    this.name = "";
    this.downloads = 0;
  }

  public String getName()
  {
    return this.name;
  }

  public int getDownloads()
  {
    return this.downloads;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getDownload()
  {
    return this.downloads;
  }

  public void setDownloads(int downloads)
  {
    this.downloads = downloads;
  }

  public String toString()
  {
    return name + " " + downloads;
  }
}

class MobileGame extends Apps
{

  public String companyName;

  public MobileGame(String name, int downloads, String companyName)
  {
    super(name, downloads);
    this.companyName = companyName;
  }

  public String getCompanyName()
  {
    return this.companyName;
  }

  public void setCompanyName(String CompanyName)
  {
    this.companyName = CompanyName;
  }

  @Override
  public String toString()
  {
    return name + " " + downloads + " " + companyName;
  }
}

public class Results
{

  public static int onlinePlayers(int x)
  {
    return x;
  }

  public static int onlinePlayers(int x, int y)
  {
    return (x * y);
  }

  public static void main(String[] args)
  {
    Apps app1 = new Apps("League of Legends", -10000000);
    System.out.println(app1);
    System.out.println(onlinePlayers(-1000));
    MobileGame obj2 = new MobileGame("Valorant", 9999999, "Riot Games");
    System.out.println(obj2);
    System.out.println(onlinePlayers(1000, 1000));
  }
}
