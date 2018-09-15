; Classic recursion
(defn fibonacci
  [x]
  (cond 
    (= x 0) 0
    (= x 1) 1
:else (+ (fibonacci (dec x)) (fibonacci (- x 2)))))

(fibonacci 3)
(fibonacci 8)
