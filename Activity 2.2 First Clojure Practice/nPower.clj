; Classic recursion
(defn nPower 
  [number power]
  (if (zero? power) 1
      (* number (nPower number (dec power)))))
    
(nPower 2 4)
(nPower 2 8)
(nPower 3 2)


; Tail recursion
(defn nPower_tailRecursion
  [number power]
  (loop [acc 1 power power]
    (if (zero? power) acc
        (recur (* number acc) (dec power)))))

(nPower_tailRecursion 2 4)
(nPower_tailRecursion 2 8)
(nPower_tailRecursion 3 2)
