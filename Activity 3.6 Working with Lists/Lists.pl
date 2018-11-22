% Exercise 6.1

doubled(List) :- append(X, X, List).
% EXAMPLE QUERIES:
% doubled([a,b,c,a,b,c]). -> yes.
% doubled([foo,gubble,foo]). -> no.


%% Exercise 6.2

accRev([],A,A).
accRev([H|T],A,R) :- accRev(T,[H|A],R).
rev(L,R) :- accRev(L,[],R).
palindrome(List) :-
  rev(List, List).
% EXAMPLE QUERIES:
% palindrome([r,o,t,a,t,o,r]). -> yes.
% palindrome([n,o,t,h,i,s]). -> no.


%% Exercise 6.3

toptail([_|T],R) :- append(R,[_],T).
% EXAMPLE QUERIES:
% toptail([a],T). 
% toptail([a,b],T). 
% toptail([a,b,c],T). 


% Exercise 6.4

last_rev(List, X) :- reverse(List, [X|_]).
% EXAMPLE QUERIES:
% last_rev([a, b], b). -> yes.
% last_rev([a, b], b). -> no.

% Using recursion
last_rec([X], X).
last_rec([_|T], X) :- last_rec(T, X).
% EXAMPLE QUERIES:
% last_rev([a, b], b). -> yes.
% last_rev([a, b], b). -> no.


% Exercise 6.5

swapfl([H1|T1], [H2|T2]) :-
    reverse(T1, [H2|X]),
    reverse(T2, [H1|X]).
% EXAMPLE QUERIES:
% swapfl([a,b,c], [c,b,a]). -> yes.
% swapfl([a,b,c], [a,b,c]). -> no.


% Exercise 6.6

neighbor(Left, Right, List) :- 
        List = [Left | [Right | _]];
        List = [_ | [Left | Right]].

zebraowner(Houses, ZebraOwner):-
        member([englishman, _, red], Houses),
        member([spanish, jaguar, _], Houses),
        neighbor([_, snail, _], [japanese, _, _], Houses),
        neighbor([_, snail, _], [_, _, blue], Houses),
        member([ZebraOwner, zebra, _], Houses),
        member([_, _, green], Houses).

zebra(X) :- zebraowner([_, _, _], X).
% EXAMPLE QUERIES:
% zebra(japanese). -> yes.
% zebra(englishman). -> no.
