(ns bob)

(defn shouty? [s] (and (not= nil (re-find #"[A-Z]" s))(= nil (re-find #"[a-z]" s))))

(defn response-for
  [s]
  (cond
   (empty? (.trim s)) "Fine. Be that way!"
   (shouty? s) "Woah, chill out!"
   (.endsWith s "?") "Sure."
   :else "Whatever."  ))

