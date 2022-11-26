@Login
Feature: Login Giris

  @admin
  Scenario: Admin girisi
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Sayfayi kapatir

  @staff
  Scenario: Personel girisi
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Staff gecerli bir Username girer
    And   Staff gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Sayfayi kapatir

  @doktor
  Scenario: Doktor girisi
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Doktor gecerli bir Username girer
    And   Doktor gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Sayfayi kapatir

  @hasta
  Scenario: Hasta girisi
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Hasta gecerli bir Username girer
    And   Hasta gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Sayfayi kapatir



