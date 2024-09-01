(ns no.olavfosse.nameboard
  (:require
   ["react-dom" :as ReactDOM]
   ["react-dom/client" :as ReactDOMClient]
   ["react" :as React]
   ["tldraw" :refer [Tldraw]]))

(defn init! []
  (def container (.getElementById js/document "root"))
  (def root (ReactDOMClient/createRoot container))
  (.render root (React/createElement Tldraw nil)))


