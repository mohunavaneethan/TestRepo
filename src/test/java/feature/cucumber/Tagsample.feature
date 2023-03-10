Feature: sample scenario for tags


@sanity @smoke @regression
Scenario: tags sample one
Given tags sample method one 

@smoke
Scenario: tags sample two
Given tags sample method two

@sanity
Scenario: tags sample three
Given tags sample method three
 
 @smoke @regression
Scenario: tags sample four
Given tags sample method four

@regression
Scenario: tags sample five
Given tags sample method five

@omit
Scenario: tags sample six
Given tags sample method six