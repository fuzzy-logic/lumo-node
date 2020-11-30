(-> (str "http://localhost:" port)
       rp
       (.then (fn [body] (println "\nReceived:" body)))
       (.catch (fn [err] (println "\nOops:" (.-stack err)))))