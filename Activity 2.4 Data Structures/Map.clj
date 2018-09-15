; Define a hash-map
;(hash-map :a 1 :b 2 :c 3 :d 4 :e 5)
(def myMap {:a 1 :b 2 :c 3 :d 4 :e 5})
"Define and create a hash-map with keys and their values"
myMap

; Count number of entries in map
"Count number of entries in myMap using count"
(count myMap)

;Get the value of a certain key
"Retrieve the value of the key :c in myMap"
;(myMap :c)
;(:c myMap)
;({:a 1 :b 2 :c 3 :d 4 :e 5} :c)
(get myMap :c)

; Provide a default value if key is not found
"If a key is not found, return a default value or message"
"Get the value for the key :f"
myMap
(get myMap :f "Key not found")

; Check if a given key is present in the map
"Check if the key :d is present in myMap"
(contains? myMap :d)
; Check if a given key is missing in the map
"Check if the key :f is missing in myMap"
(contains? myMap :f)

; Associate new entries to existing map
"Associate new entry (:f 6) to myMap"
(assoc myMap :f 6)

; Dissociate entries from existing map
"Dissociate entry from myMap"
(dissoc myMap :e)

; Get all the keys from the map
"Get all the keys from myMap"
;(sort(keys myMap))
(keys myMap)

; Get all the values from the map
"Get all the values from myMap"
;(sort(vals myMap))
(vals myMap)






