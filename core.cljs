(ns map-test.core
    (:require
              [reagent.core :as reagent :refer [atom]]
              [reagent.dom :as rd]))

(enable-console-print!)

(println "This text is printed from src/map-test/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))


(defn hello-world []
  [:div {:style {:color "white"}}
    [:div.imageWrapper {:style {:width "100%" :max-width "768px" :max-height "576px" :margin "0 auto" :position "relative"}}
      [:img {:src "dummy.jpg" :width "100%" :height "100%"} ]
      [:div {:style {:position "absolute" :top "66%" :left "25%"} :on-click #(js/alert "Fangorn Forest")} "Fangorn Forest"]
        [:div {:style {:position "absolute" :top "16%" :left "28%"} :on-click #(js/alert "Black Rock")} "Black Rock"]
        [:div {:style {:position "absolute" :top "30%" :left "50%"} :on-click #(js/alert "Blue Recluse")} "Blue Recluse"]
  ]
])

(rd/render [hello-world]
           (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
