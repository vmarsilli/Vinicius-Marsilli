# Exploratory Testing - Monefy Mobile App

Monefy is an app to help users to manage their finances, as incomes and expenses. The version used to create this document was the Free one (not Pro) for IOS devices. However, the Pro version features were considered during exploratory tests creation.


## Testing Prioritisation

Considering Monefy's major purpose, as mentioned above, the testing approach will prioritize data insertion and deletion, graph and categories exhibition, and balance updates. It is necessary to make sure that every new entry on the application will be inserted with correctly input values, on correct category and also that total balance, expenses balance and income balance are updated successfully.
Furthermore, graph exhibition must follow all data inputs/outputs and categories amounts. For these tests, more time was estimated for their test process.
After making sure those functionalities are working, the testing scope should proceed to validating remaining options and menus.


## Testing Charters

**Explore app's home screen by browsing through smartphone's touch screen to discover its main features and options initially available, in order to validate app's navigability.**
**Estimated time:** 10 minutes
**Charter Findings:** While browsing the application, it was possible to identify some filter options for inputs as well as for accounts created. It was also possible to check options for entering and displaying data from home screen. In addition, several options for adjusting and manipulating categories and accounts were checked in side menu. While browsing application, some tags with tips are displayed. All available screens and menus have opened successfully.
**Found Issues:** After opening Rigth Sidepanel, there is the option to click on "Close navigation" button. After clicking on it, the Right Sidepanel is close. However, instead going to main screen it opens the Left Sidepanel.



**Explore menus and additional options available in app through the buttons and items displayed in search of settings for optimization and adjustments of the application, as well as tutorials.**
**Estimated time:** 15 minutes
**Charter Findings:** Through the right lateral menu, items for customizing the application were identified, such as changing the language, currency, categories, choosing a day of the week, configuring passcode and backup and data restoration, as well as an option for cleaning. overall system. No tutorial items were found for the application. All menu items available for the used version have opened successfully.



**Explore on the app's home screen the possibilities for entering financial information, inputting numerical values and selecting available configuration options, in order to find out if all options are being correctly created and if it is available to use negative input values.**
**Estimated time:** 25 minutes
**Charter Findings:** Data can be entered in two ways: by clicking on highlighted buttons on home screen "EXPENSE" or "INCOME" or on category figure around graph at screen's center. Through the main buttons, when inserting a new expense/income, it is required that a numerical value is inserted and a category is chosen, and there is also the option to add a note for the input and also to change its date. Choosing to enter a data through the category, only the amount of the expense and option of a note is required. After confirming the data, a message at the bottom of the page is displayed indicating a new item added and a "UNDO" button. By clicking "UNDO" the item is successfully removed. Only positive values are allowed for expenses/incomes. No issues found on creating new inputs. 



**Explore the calculator available when inserting a new income/expense, perform calculation with different values (positive, negative, decimal) to find out if it performs the calculations correctly.**
**Estimated time:** 15 minutes
**Charter Findings:** The calculator has only the 4 basic operations, a decimal number option and an "equal" button. During tests, several calculations were performed and calculator performed all of them correctly. No problems found



**Explore the possibilities for displaying users information at app's home screen, during navigation and after entering information, to find out how the inputs are displayed on the screen, as well as categories organization and items values updates.**
**Estimated time:** 20 minutes
**Charter Findings:** After expenses/incomes are inserted or updated, value of central graph is updated showing incomes values in green and outcomes in red. Also, new item is added to the list of expenses/incomes and the percentage of the category is updated successfully. All values and items entered have been updated and/or removed successfully. In order to access expenses/incomes list, it is necessary to click on the "Balance" box or in one of the "slices" of central pizza graph. All those options are being displayed successfully and without any errors.



**Explore options for creating/updating/deleting categories, changing the name and icon of the category to different values, to find out if they are updated correctly and are available for selection when creating a new entry in the application.**
**Estimated time:** 15 minutes
**Charter Findings:** When opening categories menu, a list of all existing categories is opened. After selecting one of them, an editing screen opens allowing to change its name and icon. However, in order to commit those changes, or create a new category or delete one of theme, it is necessary to have app's Pro version.



**Explore options for editing and deleting items, opening the current list of expenses and incomes, to find out if after editing or deleting an item, the list of inputs and the graph on the home screen are updated according to changes made.**
**Estimated time:** 10 minutes
**Charter Findings:** When opening the list of items, it is possible to expand the displayed category and select one of the available entries. An editing screen opens, allowing to change the value or category and also the exclusion. After performing one of the previous operations, the values are changed correctly in the list, in the balance total and in the graph. No problem found for updating or removing entries.



**Explore options for creating/updating/deleting Accounts, creating new ones and/or changing existing ones, to discover the available options and if options are being executed correctly.**
**Estimated time:** 15 minutes
**Charter Findings:** To create a new account, you must enter a title and an icon. As optional items, it is possible to include an initial balance amount and an initial date for this balance. For updating an account the same fields are required. For deletion, a confirmation popup is displayed. When carrying out one of the two previous operations, the total balance amount is being updated successfully. No other problem found in these operations.



**Explore the options of transferring between accounts informing different values and alternating between available accounts, in order to discover the update behavior of the charts and accounts.**
**Estimated time:** 15 minutes
**Charter Findings:** When making a transfer, it is possible to inform any positive amount and the balance of each account involved in transaction is updated successfully. It is not possible to select the same category for the transfer to take place. The transfer of value between accounts can be carried out even if the source account has no value of '' balance> 0 '' (I believe this is an expected behavior since the balance of an account can be negative). No problems were encountered during transfer test.
**Found Issues:** The "from" and "to" fields must be selected before inputting transfer amount, meantime you will not be able to close numbers pad if you click it first.



**Explore filter options by "Accounts", accessing the top left menu and changing among the available options, to find out what changes in views they change on the app's home screen.**
**Estimated time:** 10 minutes
**Charter Findings:** For "Accounts" filter it is possible to select "All accounts" option or one of the created accounts. When alternating between accounts through filter options, balance for each account and categories items are updated successfully.
**Found Issues:** Upon completion of a transfer, the balance for each individual account is successfully updated. However, by selecting the "All accounts" option, no value referring to transfers is displayed on the graph.
Also, for the account with more than one transfer, the items referring to them are displayed separately in the graph and are not grouped as in the other categories.


**Explore filter options by "Dates Periods", accessing the top left menu and selecting the different periods available as options, to find out what changes in views they change on the app's home screen.**
**Estimated time:** 10 minutes
**Charter Findings:** Date filters have following options: Day, Week, Month, Year, All, and Choose date. When selecting each of the filters, starting area is updated and chart and list of expenses/incomes only show items for the selected period. Day of the week, or month or year label, indicating chosen filter, is displayed above main graph.
**Found Issues:** When opting by "Choose date" filter it is possible to choose a specific date. However, if main date filter is not "Day", the graph remains the same and there is no indication that displayed values are only for selected day.



**Explore the creation and use of a passcode protection for accessing the application, stating the valid value required to create it, to discover the reliability in the app security process.**
**Estimated time:** 20 minutes
**Charter Findings:** After accessing the app, you can find "Passcode protection" option on right side menu. It allows you to create a 4-digit pin code to access the application. In case of compatible devices, the system allows login via TouchID or FaceID. To create passcode, application's Pro version is required.



**Explore the data synchronization options, changing between the available cloud storage services options, to find out if the synchronization is performed correctly.**
**Estimated time:** 15 minutes
**Charter Findings:** For synchronization mode, two Cloud Storage Services options are displayed: Google Drive and Dropbox. For synchronization, application's Pro version is required.



**Explore the data backup and restore options by choosing from the options available to find out if the generated backup file is successfully exported and/or restored.**
**Estimated time:** 35 minutes
**Charter Findings:** After choosing backup option, a confirmation popup is displayed. By clicking "Yes" a file is generated and saved in device's file folder. Choosing Restore Data option, a popup is displayed with a list of all files available for restore. After selecting it, current section information is updated to restored version. No error was encountered during backup or restore processes.



## Areas of Risk 

For Monefy app the major areas of risk are based on its data security, on its reliability on balance calculation and its finance accounts management.
When using a system to manage finances and money, it is important that all data inserted on it are secured and only the user can have access to those information. In this case, it is important that after passcode creation, only users with correct code can access the app. Also, when synchronizing the app with external accounts, the data is correctly synchronized on chosen cloud service.
In addition, it is necessary to check users expenses and to be able to project future ones based on your current money amount. The application must calculates final balance correctly.
Furthermore, as it provides multiple accounts creation and management, it is important that Monefy calculates each account total correctly and total amount for all of them precisely, avoid misunderstanding of real expenses.
