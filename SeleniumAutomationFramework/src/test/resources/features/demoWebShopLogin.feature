Feature: Login into demoWebShop

  @demoWebShopLogin
  Scenario Outline: Logging in to make my trip site
    Given Load the demoWebShop "https://demowebshop.tricentis.com/login"
    When Enter the credentials "<userName>" and "<passWord>" in the demoWebShop
    Then Validate that user moved to Home page

    Examples:
      | userName         | passWord |
      | ARIF12@gmail.com | Akh123   |