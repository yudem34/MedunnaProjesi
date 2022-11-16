Feature: Medunna US_17 TC01

  @US17TC01
  Scenario: Admin yeni test ogeleri olusturabilir
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Items&Title menusunden Test Item secenegine tiklar
    And   Create a new Test Item butonuna tiklar
    And   Istenilen bilgileri doldurur ve Save butonuna tiklar
    And   Kaydedildi yazisinin gorunurlugunu kontrol eder
    And   Sayfayi kapatir

