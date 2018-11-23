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







WebDriver driver = DriverFactory.getWebDriver()

//Expected value from table
String ExpectedValue = "janine";

//To locate table
WebElement Table = driver.findElement(By.xpath("//table.tbody"))

//Create an array to list all rows
List<WebElement> rows_table = Table.findElements(By.tagName('tr')) /* rows_table = {row 0, row 1, row 2, row3..} */

//To calculate the no of rows in table
int rows_count = rows_table.size()

/* Loop will execute for all the rows in the table
Loop: rows_table = {row 0, row 1, row 2, row3..} */

for (int row = 0; row < rows_count; row++) {
	//Create an array to list all columns.
	List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td')) /* column_row = {col 0, col 1, col 2, col 3..} */
	
	//To calculate no of columns(cells) In that specific row
	int columns_count = Columns_row.size()
	
	println((('Number of cells In Row ' + row) + ' are ') + columns_count)
	
	//Loop will execute till the last cell of that specific row
	for (int column = 0; column < columns_count; column++) {
		//It will retrieve text from each cell
		String celltext = Columns_row.get(column).getText()
		
		println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
		
		//Checking if Cell text is matching with the expected value
		if (celltext == ExpectedValue) {
			//Getting the Country Name if cell text i.e Company name matches with Expected value
			println('Text present in row number 3 is: ' + Columns_row.get(2).getText())
			
			//After getting the Expected value from Table we will Terminate the loop
			break;
		}
	}
}

