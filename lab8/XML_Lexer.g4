//Lab 8 XML Lexer


lexer grammar XML_Lexer;

//check first letter is a letter or underscore and not x or X so it can't start with
//anyform of xml
fragment BEGINELEMENT: [a-wyzA-WYZ_];

//valid chars for element name
fragment OKCHAR: [a-zA-Z0-9-._]+ ;


      


//EMAIL

//need to figure out how to catch consecutive period characters
fragment LOCAL_SUBPART : [a-zA-Z0-9-_~!$&\'()*+,;=:]+;
fragment DOMAIN_SUBPART : [a-zA-Z0-9-]+;
fragment LOCAL: LOCAL_SUBPART('.' LOCAL_SUBPART)* ;
fragment DOMAIN: DOMAIN_SUBPART('.' DOMAIN_SUBPART)*;

EMAIL: '<''email''>' LOCAL '@' DOMAIN '</''email''>' {
System.out.println("valid email: "+getText());
};



//DATE
fragment SLASH: '/';

fragment ZERO: [0];
fragment ONE: [1];
fragment TWO: [2];
fragment THREE: [3];
fragment FOUR: [4];
fragment FIVE: [5];
fragment SIX: [6];
fragment SEVEN: [7];
fragment EIGHT: [8];
fragment NINE: [9];
fragment ZEROtoTWO: [0-2];
fragment ZEROtoFIVE: [0-5];
fragment ONEtoTWO: [1-2];
fragment ONEtoFIVE: [1-5];
fragment DIGIT: [0-9];
fragment DIGITgreaterthanZERO: [1-9];

//0 [1-9] | [1-9] | [1-2] [0-9] | 3 0 | 3 1
fragment DAY: ZERO DIGITgreaterthanZERO 
  | DIGITgreaterthanZERO 
  | ONEtoTWO DIGIT  
  | THREE ZERO
  | THREE ONE
  ;

//0+[1-9] | [1-9]  | 1 0 | 1 1 | 1 2
fragment MONTH:  ZERO DIGITgreaterthanZERO
  | DIGITgreaterthanZERO
  | ONE ZERO
  | ONE ONE
  | ONE TWO
  ;

//2 0 [0-9] [0-9] | 2 1 0 0
fragment YEAR: TWO ZERO DIGIT DIGIT
  | TWO ONE ZERO ZERO
  ;

 DATE: '<''date''>' DAY SLASH MONTH SLASH YEAR '</''date''>'{
System.out.println("valid date: "+getText());
};



//PHONE (used number fragments from Date section)

fragment PARENTHESISopen: '(' ;
fragment PARENTHESISclose: ')' ;
fragment HYPHEN: '-';
fragment DOT: '.';
fragment SPACE: ' ';
//[0-9][0-9][0-9]
fragment DIGIT3 : DIGIT DIGIT DIGIT;
//[0-9][0-9][0-9][0-9]
fragment DIGIT4 : DIGIT DIGIT DIGIT DIGIT;


PHONE : '<''phone''>'(DIGIT3  HYPHEN DIGIT3 HYPHEN DIGIT4
  | DIGIT3 DOT DIGIT3 DOT DIGIT4
  | DIGIT3 SPACE DIGIT3 SPACE DIGIT4
  | PARENTHESISopen DIGIT3 PARENTHESISclose DIGIT3 HYPHEN DIGIT4)'</''phone''>'
  {
  System.out.println("valid phone: "+getText());
  };





//CREDIT CARD
fragment VISA: FOUR DIGIT3 DIGIT4 DIGIT4 DIGIT4;
fragment VISAOLD: FOUR DIGIT4 DIGIT4 DIGIT4;
//Don't need to worry about mastercard 51-55 because anything else that starts
//with 5 is the diners club mastercard
fragment MASTERCARD: FIVE DIGIT3 DIGIT4 DIGIT4 DIGIT4;
fragment AMERICANEXP: THREE FOUR DIGIT DIGIT4 DIGIT4 DIGIT4
  | THREE SEVEN DIGIT DIGIT4 DIGIT4 DIGIT4
  ;
fragment DINER: THREE ZERO ZEROtoFIVE DIGIT3 DIGIT4 DIGIT4
  | THREE SIX DIGIT4 DIGIT4 DIGIT4
  | THREE EIGHT DIGIT4 DIGIT4 DIGIT4
  ;
fragment DISCOVER: SIX ONE ZERO ZERO DIGIT4 DIGIT4 DIGIT4
  | SIX FIVE DIGIT DIGIT DIGIT4 DIGIT4 DIGIT4
  ;
fragment JCB: TWO ONE THREE ONE DIGIT4 DIGIT4 DIGIT4
  | ONE EIGHT ZERO ZERO DIGIT4 DIGIT4 DIGIT4
  | THREE FIVE DIGIT DIGIT DIGIT4 DIGIT4 DIGIT4
  ;

  CREDITCARD: '<''creditcard''>'(VISA
  | VISAOLD
  | MASTERCARD
  | AMERICANEXP
  | DINER
  | DISCOVER
  | JCB)'</''creditcard''>'
 {
    System.out.println("valid credit card: "+getText());
  };
//OTHER
fragment OTHERS: [a-zA-Z0-9-_~.!$&'()*+,;=:' ']+;
OTHER: '<''address''>'OTHERS'</''address''>'
{
    System.out.println("valid other: "+getText());
  };

WS: [ \r\n\t]+         {skip();} ;
