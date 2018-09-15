; Define set of integers
;(set '(10 20 30 40 50))
(def intSet #{10 20 30 40 50})
"Define and create a set of integers"
intSet

; Order set of integers
"Sort intSet using apply sorted-set"
(apply sorted-set intSet)

; Count number of elements in set
"Count number of elements in intSet using count"
(count intSet)

; A set gets rid of duplicates
"If there are any duplicates in a collection, they will be removed"
"BEFORE"
"(set [1 1 2 2 2 3 3 4 5 5 5 5])"
"AFTER"
; With set keyword, it removes all duplicates automatically
(sorted-set 1 1 2 2 2 3 3 4 5 5 5 5)

; Get the union of two sets
"Get the union of two sets"
(sorted-set 1 2 3 4)
(sorted-set 2 3 5)
"UNION"
(clojure.set/union (sorted-set 1 2 3 4) (sorted-set 2 3 5))

; Get the intersection of two sets
"Get the intersection of two sets"
(sorted-set 1 2 3 4)
(sorted-set 2 3 5)
"INTERSECTION"
(clojure.set/intersection (sorted-set 1 2 3 4) (sorted-set 2 3 5))

; Get the difference of two sets
"Get the difference between two sets"
(sorted-set 1 2 3 4 5)
(sorted-set 2 3 5)
"DIFFERENCE"
(clojure.set/difference (sorted-set 1 2 3 4 5) (sorted-set 2 3 5))







