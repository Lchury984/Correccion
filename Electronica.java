public class Electronica {
  private String drumps;
  private String bass;

  public Electronica(String drumps, String bass) {
      this.drumps = drumps;
      this.bass = bass;
  }

  public String getDrumps() {
      return drumps;
  }

  public void setDrumps(String drumps) {
      this.drumps = drumps;
  }

  public String getBass() {
      return bass;
  }

  public void setBass(String bass) {
      this.bass = bass;
  }

  public class House extends Electronica {
      private String vocales;

      public House(String drumps, String bass, String vocales) {
          super(drumps, bass);
          this.vocales = vocales;
      }

      public String getVocales() {
          return vocales;
      }

      public void setVocales(String vocales) {
          this.vocales = vocales;
      }
  }


  public class Guaracha extends Electronica {
      private String vocales;
      private String trumpet;

      public Guaracha(String drumps, String bass, String vocales, String trumpet) {
          super(drumps, bass);
          this.vocales = vocales;
          this.trumpet = trumpet;
      }

      public String getVocales() {
          return vocales;
      }

      public void setVocales(String vocales) {
          this.vocales = vocales;
      }

      public String getTrumpet() {
          return trumpet;
      }

      public void setTrumpet(String trumpet) {
          this.trumpet = trumpet;
      }
  }

}

public class Main {
    public static void main(String[] args) {
        Electronica[] musicList = new Electronica[3];
        musicList[0] = new Electronica("tambores electronicos", "guitarra baja");
        musicList[1] = new House("tambores de house", "bajo profundo", "vocales");
        musicList[2] = new Guaracha("tambores latinos", "guitarra baja", "vocales energeticas", "melodia de trompeta");

        for (Electronica musicList1 : musicList) {
            switch (musicList1) {
                case House house -> System.out.println("House: " + house.getDrumps() + ", " + house.getBass() + ", " + house.getVocales());
                case Guaracha guaracha -> System.out.println("Guaracha: " + guaracha.getDrumps() + ", " + guaracha.getBass() + ", " + guaracha.getVocales() + ", " + guaracha.getTrumpet());
                default -> System.out.println("Electronica: " + musicList1.getDrumps() + ", " + musicList1.getBass());
            }
        }
    }
}


