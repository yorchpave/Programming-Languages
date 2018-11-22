% All witches are women
 % Witches are burned
witch(X) :- burns(X), female(X).

% Witches burn if they are made out of wood
burns(X) :- wooden(X).

% Witches are made out of wood if they float
wooden(X) :- floats(X).

% Witches float if they weight the same as a duck
floats(X) :- sameWeight(duck, X).

% Here I specify by observation if someone is 
% female.
female(girl).

% By experiment, I specify that "girl" does
% actually weights the same as a duck.
sameWeight(duck, girl).

% Therefore, "girl" is a witch!



