(ns no.olavfosse.nameboard
  (:require
    ["react-dom" :as ReactDOM]
    ["react" :as React]
    ["tldraw" :refer [Tldraw]]))

(defn init! []
  (ReactDOM/render
    (React/createElement Tldraw nil)
    (.getElementById js/document "root")))
