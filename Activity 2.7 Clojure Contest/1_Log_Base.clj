; Log base c ((a + b)^c)
(defn log [c a b] 
    (/ (Math/log(Math/pow(+ a b) c)) (Math/log c) 
    )
)
(log 2 3 4)
