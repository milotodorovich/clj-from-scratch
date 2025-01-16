(ns this-project.protocols.controller)

;; This represents the interface that `controller-method`
;; expects from its collaborators.
;;
;; Provides a seam to inject different implementations.
(defprotocol Finder
  (find-product [this id])
  (find-price [this product-id]))

(defn controller-method
  "The method that represents a business function. Accepts
  a finder that encapsulates collaborators to other parts
  of the system."
  [finder]
  (let [product (find-product finder 1)
        price (find-price finder (:product-id product))]
    (println (str "Found the product: " product))
    (println (str "The price is: " price))))



