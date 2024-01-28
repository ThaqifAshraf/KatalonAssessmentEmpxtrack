<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>This is data drive test case. Resetting Password using Usernames from Empxtrack</description>
   <name>ResetPasswords</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>c70e714e-5011-4126-8f74-07fbb89cda57</testSuiteGuid>
   <testCaseLink>
      <guid>8e2af50e-caf7-4072-877c-a2fb308024df</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02 - Reset Password/TC04 - Reset Password</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>27a4f47f-c320-4f08-9bd4-74a1d6785406</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/ResetPass</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>27a4f47f-c320-4f08-9bd4-74a1d6785406</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>6af965af-ba34-4537-b7e0-1cc1078eab8d</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>2d92a9b5-db63-42cb-b56c-2916221a63e7</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02 - Reset Password/TC05 - Enter Wrong Username</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>fed64be1-0af5-46f6-ab5a-e9a31f7f72d6</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/ResetPass</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>fed64be1-0af5-46f6-ab5a-e9a31f7f72d6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>wrongUsername</value>
         <variableId>8331cb0e-45d9-4bcf-a7c7-45bd9e33d882</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>e4970d6e-94fc-4b45-9b39-4ec65c5828d0</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/02 - Reset Password/TC06 - Enter Wrong Company ID</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>8d3f2f91-687d-4c15-87b7-fe11ec0b7e82</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/ResetPass</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>8d3f2f91-687d-4c15-87b7-fe11ec0b7e82</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>wrongBussinessID</value>
         <variableId>e89b917f-5b5c-4bb4-a8f4-36f811993f85</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
