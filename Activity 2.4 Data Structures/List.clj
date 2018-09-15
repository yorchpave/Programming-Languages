; Define list of integers
; (def intList (list 1 2 3 4 5))
(def intList '(1 2 3 4 5))
"Define and create a list of integers"
intList

; Access first element of the list
"Get first element of intList using first"
(first intList)

; Access rest of elements of the list
"Get rest of elements of intList using rest"
(rest intList)

; Add an element to the front of the list
"Add 0 to the front of intList using cons"
(cons 0 intList)

; Add an element to the front of the list in reverse order
"Add 0 to the front of intList using conj"
(conj intList 0)

; Use list like a stack to get first element
"Get first element of intList using peek"
(peek intList)

; Use list like a stack to get rest of elements of the list
"Get rest of elements of intList using pop"
(pop intList)

