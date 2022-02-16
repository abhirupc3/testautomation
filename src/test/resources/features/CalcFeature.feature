Feature: TestCalculator 

Scenario Outline: validate add function 
	Given I have to add <digita> with <digitb> 
	When I make an adition 
	Then I get result as <result> 
	But I give <welcome> message 
	Examples: 
		|digita |digitb  |result|welcome|
		|24     |15      |39    |Hi|
		|14     |15      |29    |Hello|
