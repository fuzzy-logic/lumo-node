(require 'express)
(require '[request-promise :as rp])
(def port 3000)

(-> (express)
    (.get "/" (fn [req res] (.send res "Hello Lumo")))
    (.listen port))

