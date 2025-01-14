(ns this-project.protocol-record)

(defprotocol Finder
  (find-product [this id])
  (find-price [this product-id]))

(defrecord DBFinder [_]
  Finder
  (find-product [_ id]
    (println "This is SLOW....")
    (Thread/sleep 1000)
    {:product-id id})
  (find-price [_ product-id]
    (println "This is SLOW....")
    (Thread/sleep 1000)
    {:product-id product-id :price 100}))

(defrecord MockFinder []
  Finder
  (find-product [_ id]
    (println "This is FAST")
    {:product-id id})
  (find-price [_ product-id]
    (println "This is FAST")
    {:product-id product-id :price 10}))

(defn controller-method [finder]
  (let [product (find-product finder 1)
        price (find-price finder (:product-id product))]
    (println (str "Found the product: " product))
    (println (str "The price is: " price))))

(comment
  (time (controller-method (->MockFinder)))
  (time (controller-method (->DBFinder {}))))

