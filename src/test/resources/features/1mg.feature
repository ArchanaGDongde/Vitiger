@1mgTest
Feature: Set the location and add the tablet if delvery date is Today

Background: common steps
Given User opens the 1mg application
When close the Ads Set the location as Bengaluru


Scenario: Search the tablet

And Search for a tablet 
When If the delivery date is today add the tablet to cart otherwise no
#Then check the car Quantity Amount and description match
And remove the tablet from cart













