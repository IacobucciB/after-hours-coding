(custom-set-variables
 ;; custom-set-variables was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 '(custom-enabled-themes '(tango-dark))
 '(package-selected-packages
   '(company use-package tree-sitter-langs tree-sitter magit pandoc doom-themes)))
(custom-set-faces
 ;; custom-set-faces was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 )

;; Add Melpa package repository
(require 'package)
(add-to-list 'package-archives '("melpa" . "https://melpa.org/packages/") t)
;; Uncomment the next line if you prefer melpa-stable
;; (add-to-list 'package-archives '("melpa-stable" . "https://stable.melpa.org/packages/") t)
(package-initialize)

;; Change default font size
(set-face-attribute 'default nil :height 120)

;; Enable relative line numbers
(global-display-line-numbers-mode 1)
(setq display-line-numbers-type 'relative)

;; Enable highlight current line
(global-hl-line-mode t)

;; Disable the beep sound
(setq ring-bell-function 'ignore)

;; Install and configure doom-themes
(unless (package-installed-p 'doom-themes)
  (package-refresh-contents)
  (package-install 'doom-themes))

;; Load and set a Doom theme
(load-theme 'doom-nord t)   ; Replace 'doom-one' with the theme of your choice

;; Configuration to set UTF-8 as the default encoding
(prefer-coding-system 'utf-8)

;; Disable the tool bar
;; (tool-bar-mode -1)

;; Disable the menu bar
;; (menu-bar-mode -1)

;; Remove Scroll Bar
;; (scroll-bar-mode -1)

;; Set Scratch Buffer as Default
(setq inhibit-startup-buffer-menu t)  ; Inhibit the startup buffer menu
(setq initial-buffer-choice t)         ; Set the scratch buffer as the default
(setq initial-scratch-message nil)     ; Remove the initial scratch message

;; Open Emacs in Fullscreen
;; (toggle-frame-fullscreen)

;; Uncomment the following line if you want Emacs to always start in fullscreen mode
;; (add-hook 'emacs-startup-hook 'toggle-frame-fullscreen)

;; Install required packages using use-package
(use-package tree-sitter
  :ensure t
  :config
  (require 'tree-sitter-langs)

  ;; Load the languages you want (Python, Java, Ruby)
  (tree-sitter-require 'python)
  (tree-sitter-require 'java)
  (tree-sitter-require 'ruby)

  ;; Define major modes to enable Tree-sitter for each language
  (add-hook 'python-mode-hook #'tree-sitter-hl-mode)
  (add-hook 'java-mode-hook #'tree-sitter-hl-mode)
  (add-hook 'ruby-mode-hook #'tree-sitter-hl-mode)
  )

;; Company Mode:
(use-package company
  :ensure t
  :config
  (add-hook 'after-init-hook 'global-company-mode))
