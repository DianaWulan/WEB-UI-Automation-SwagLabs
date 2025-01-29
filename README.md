
# WEB UI Automation SwagLabs Project

## **Project Overview**
This project is a Quality Assurance (QA) Automation test suite developed for the e-commerce platform **SwagLabs**. The goal of this project is to validate the platform’s core functionalities including Login, Product Management, Cart, and Checkout features and Logout using automation tools.

**Demonstration:** https://youtu.be/lA5xjSYrCcw?si=qPEKO8p6XzFDtw-W

---

## **Objective**
To ensure the reliability and functionality of the SwagLabs application through automated testing, covering both positive and negative scenarios for key workflows.

---

## **Features Tested**
1. **Login Page**
   - Valid and invalid login scenarios.
   - Error message validation for incorrect credentials.

2. **Product Page**
   - Add products to the cart.
   - Remove products from the cart .

3. **Cart Page**
   - Verifying product quantities.
   - Removing items from the cart.

4. **Checkout Page**
   - Validating user information.
   - Completing the checkout process.

5. **Logout Page**
   - Valid logout scenarios.
---

## **Tools and Technologies Used**
- **Selenium**: For browser automation.
- **TestNG**: For test case management and assertions.
- **Cucumber**: For Behavior-Driven Development (BDD) and readable test scenarios.
- **IntelliJ IDEA**: Integrated Development Environment.
- **Maven**: For dependency management and test execution.
- **ChromeDriver**: For testing on the Chrome browser.

---

## **Project Structure**
```
┣ 📂.github
 ┃ ┗ 📂workflows
 ┃ ┃ ┗ 📜main.yml
 ┣ 📂.idea
 ┃ ┣ 📜.gitignore
 ┃ ┣ 📜compiler.xml
 ┃ ┣ 📜encodings.xml
 ┃ ┣ 📜jarRepositories.xml
 ┃ ┣ 📜misc.xml
 ┃ ┗ 📜workspace.xml
 ┣ 📂src
 ┃ ┣ 📂main
 ┃ ┃ ┣ 📂java
 ┃ ┃ ┗ 📂resources
 ┃ ┃ ┃ ┣ 📂archetype-resources
 ┃ ┃ ┃ ┃ ┣ 📂src
 ┃ ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜App.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📂test
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜AppTest.java
 ┃ ┃ ┃ ┃ ┗ 📜pom.xml
 ┃ ┃ ┃ ┣ 📂META-INF
 ┃ ┃ ┃ ┃ ┗ 📂maven
 ┃ ┃ ┃ ┃ ┃ ┗ 📜archetype.xml
 ┃ ┃ ┃ ┗ 📜chromedriver.exe
 ┃ ┗ 📂test
 ┃ ┃ ┣ 📂java
 ┃ ┃ ┃ ┣ 📂pages
 ┃ ┃ ┃ ┃ ┣ 📜AddPage.java
 ┃ ┃ ┃ ┃ ┣ 📜CartPage.java
 ┃ ┃ ┃ ┃ ┣ 📜CheckoutPage.java
 ┃ ┃ ┃ ┃ ┣ 📜LoginPage.java
 ┃ ┃ ┃ ┃ ┣ 📜LogoutPage.java
 ┃ ┃ ┃ ┃ ┣ 📜ProductPage.java
 ┃ ┃ ┃ ┃ ┗ 📜RemovePage.java
 ┃ ┃ ┃ ┣ 📂runner
 ┃ ┃ ┃ ┃ ┗ 📜TestRunner.java
 ┃ ┃ ┃ ┣ 📂steps
 ┃ ┃ ┃ ┃ ┣ 📜AddStep.java
 ┃ ┃ ┃ ┃ ┣ 📜CartStep.java
 ┃ ┃ ┃ ┃ ┣ 📜CheckoutStep.java
 ┃ ┃ ┃ ┃ ┣ 📜LoginStep.java
 ┃ ┃ ┃ ┃ ┣ 📜LogoutStep.java
 ┃ ┃ ┃ ┃ ┗ 📜RemoveStep.java
 ┃ ┃ ┃ ┗ 📂utils
 ┃ ┃ ┃ ┃ ┣ 📜DriverFactory.java
 ┃ ┃ ┃ ┃ ┗ 📜NavigationHelper.java
 ┃ ┃ ┗ 📂resources
 ┃ ┃ ┃ ┗ 📂features
 ┃ ┃ ┃ ┃ ┣ 📜Add.feature
 ┃ ┃ ┃ ┃ ┣ 📜Cart.feature
 ┃ ┃ ┃ ┃ ┣ 📜Checkout.feature
 ┃ ┃ ┃ ┃ ┣ 📜Login.feature
 ┃ ┃ ┃ ┃ ┣ 📜Logout.feature
 ┃ ┃ ┃ ┃ ┗ 📜Remove.feature
 ┣ 📜.gitignore
 ┣ 📜pom.xml
 ┗ 📜README.md
```
---

## **How to Run the Project**
### **Prerequisites**
1. Install Java (JDK 11 or higher).
2. Install Maven.
3. Download Chrome browser and set up ChromeDriver.

### **Execution Steps**
1. Clone the repository:
   ```bash
   git clone https://github.com/DianaWulan/WEB-UI-Automation-SwagLabs.git
   ```

2. Navigate to the project directory:
   ```bash
   cd WEB-UI-Automation-SwagLabs
   ```

3. Execute the tests using Maven:
   ```bash
   mvn test
   ```

4. View the reports:
   - **HTML Report**: `TestReports/CucumberReport.html`
---

## **Test Scenarios**
- **Test Case:**
  https://docs.google.com/spreadsheets/d/1y5CyXMAiwQe4Qfsq9SoBnHzp9DsV42zo/edit?usp=sharing&ouid=103792211786102186489&rtpof=true&sd=true"

---

## **Contributions**
If you have suggestions or improvements for this project, feel free to submit a pull request or create an issue in the repository.

---

## **Contact**
- **Name:** Diana Wulandari
- **Email:** diana.dianawulandari@gmail.com
- **LinkedIn:** www.linkedin.com/in/dianawulandari

---

**Note:** This project is intended for demonstration purposes only and is not affiliated with Saucedemo.com.

## Authors

- [@dianawulandari](https://www.linkedin.com/in/dianawulandari)
