import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil


KeywordLogger log = new KeywordLogger()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://dev-admin.ucf88.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('ucf88_or/backoffice/login_or/input_username_bo'), 'janine')

WebUI.setEncryptedText(findTestObject('ucf88_or/backoffice/login_or/input_password_bo'), 'CSt51UwWECc=')

WebUI.click(findTestObject('ucf88_or/backoffice/login_or/button_login_bo'))

WebUI.verifyElementPresent(findTestObject('ucf88_or/backoffice/header_or/span_admin'), 3)

WebUI.mouseOver(findTestObject('ucf88_or/backoffice/header_or/span_betting'))

WebUI.verifyElementPresent(findTestObject('ucf88_or/backoffice/header_or/span_auditTrails'), 2)

WebUI.click(findTestObject('ucf88_or/backoffice/header_or/span_auditTrails'))

WebUI.delay(1)

WebDriver driver = DriverFactory.getWebDriver()

//Expected value from table
String ExpectedValue = 'nikunik'

//To locate table
WebElement Table = driver.findElement(By.xpath('//table/tbody'))

//Create an array to list all rows
List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

//To calculate the no of rows in table
int rows_count = rows_table.size()

println(rows_count)

/* Loop will execute for all the rows in the table
Loop: rows_table = {row 0, row 1, row 2, row3..} */
Loop: 
for (int row = 0; row < rows_count; row++) {
	//Create an array to list all columns.
    List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

    //To calculate no of columns(cells) In that specific row
    int columns_count = Columns_row.size()

    System.out.println((('Number of cells in Row ' + row) + ' are ') + columns_count)

    //Loop will execute till the last cell of that specific row
    for (int column = 0; column < columns_count; column++) {
        //It will retrieve text from each cell
        String celltext = Columns_row.get(column).getText()

        System.out.println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)

        //Checking if Cell text is matching with the expected value
        if (celltext == ExpectedValue) {
            System.out.println((('Text is present in row: ' + row) + ' , column: ') + column)
   
            KeywordUtil.markPassed('MERON SA TABLE!!!')
            
			System.exit(1)
   
            //After getting the Expected value from Table we will Terminate the loop
        }  
    }
}

KeywordUtil.markFailed('ERROR: Text not found!!!')