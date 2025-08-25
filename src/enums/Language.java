package enums;

public enum Language {
  KYRGYZ(),
  RUSSIAN,
  ENGLISH("EN");
  private String country;


    Language() {
    }

    Language(String country) {
        this.country = country;
    }
}
