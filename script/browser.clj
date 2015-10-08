(require '[cljs.build.api :as b])

(b/build "src/browser"
  {:output-to "main.js"
  ; :target :nodejs
   :optimizations :simple
   :static-fns true
   :pretty-print true
   :optimize-constants true
   :verbose true})

(System/exit 0)
