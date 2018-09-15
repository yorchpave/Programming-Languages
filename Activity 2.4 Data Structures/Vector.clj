; Define vector of integers
(def intVector [6 7 8 9 10])
"Define and create a vector of integers"
intVector

; Count number of elements in vector
"Count number of elements in intVector using count"
(count intVector)

;Add an element to the vector
"Add another element to intVector using conj"
(conj intVector 11)

; Get first element of the vector
"Get first element of intVector using first"
(first intVector)

; Get last element of the vector
"Get last element of intVector using last"
(last intVector)

; Get nth element of the vector
"Get nth element of intVector using nth"
(nth intVector 3)

; Slice the vector
; first number of slice is inclusive, second is exclusive
"Slice intVector from 7 to 9 using subvec"
(subvec intVector 1 4)

; Compare a vector to a list
"If a list and a vector contain the same values, then they are equal"
(list 1 2 3)
[1 2 3]
(= (list 1 2 3) (vector 1 2 3))


