;; Initialize package sources
(require 'package)

(setq package-archives '(("melpa" . "https://melpa.org/packages/")
                         ("org" . "https://orgmode.org/elpa/")
                         ("elpa" . "https://elpa.gnu.org/packages/")))

(package-initialize)

(unless package-archive-contents
  (package-refresh-contents))

;; Initialize use-package on non-Linux platforms
(unless (package-installed-p 'use-package)
  (package-install 'use-package))

(require 'use-package)
(setq use-package-always-ensure t)

;; Theme
(use-package modus-themes
  :pin melpa
  :ensure t
  :init
  (setq modus-themes-org-blocks 'gray-background
	modus-themes-fringes 'subtle
	modus-themes-italic-constructs t
	modus-themes-bold-constructs t
	modus-themes-syntax '(alt-syntax)
	modus-themes-hl-line '(intense)
	modus-themes-paren-match '(intense)
	modus-themes-mode-line '(moody borderless))
  (setq modus-themes-headings
        (quote ((1 . (overline variable-pitch 1.4))
                (2 . (overline variable-pitch 1.25))
                (3 . (overline 1.1))
                (t . (monochrome))))))

(load-theme 'modus-vivendi t)

;; Doom Themes
(use-package doom-themes
  :ensure t
  :config
  (load-theme 'doom-Iosvkem t)
   (doom-themes-visual-bell-config)
  ;; Enable custom neotree theme (all-the-icons must be installed!)
  (doom-themes-neotree-config)
  ;; or for treemacs users
  (setq doom-themes-treemacs-theme "doom-atom") ; use "doom-colors" for less minimal icon theme
  (doom-themes-treemacs-config)
  ;; Corrects (and improves) org-mode's native fontification.
  (doom-themes-org-config))

;; Doom Modeline
(use-package doom-modeline
  :ensure t
  :init (doom-modeline-mode 1))
(setq doom-modeline-icon nil)

;; Configuration to set UTF-8 as the default encoding
(prefer-coding-system 'utf-8)

;; Disable the tool bar
(tool-bar-mode -1)

;; Disable the menu bar
(menu-bar-mode -1)

;; Remove Scroll Bar
(scroll-bar-mode -1)

;; Inhibit Startup Message
(setq inhibit-startup-message t)

;; Change default font size
(set-face-attribute 'default nil :height 120)

;; Enable absolute line numbers
(global-display-line-numbers-mode 1)
(setq display-line-numbers-type 'absolute)

;; Disable line numbers for some modes
(dolist (mode '(org-mode-hook
                term-mode-hook
                eshell-mode-hook))
  (add-hook mode (lambda () (display-line-numbers-mode 0))))

;; Enable highlight current line
(global-hl-line-mode t)

;; Disable the beep sound
(setq ring-bell-function 'ignore)

;; Enable display-time-mode
(display-time-mode 1)

;; Set the clock to 24-hour format
(setq display-time-24hr-format t)

;; Company Mode
(use-package company
  :ensure t
  :commands global-company-mode
  :config
  (setq company-minimum-prefix-length 2)
  (global-company-mode))

;; Which Key
(use-package which-key
  :ensure t
  :init (which-key-mode)
  :diminish which-key-mode
  :config
  (setq which-key-idle-delay 0.3))

;; Install Ivy, Counsel, and Swiper
(use-package ivy
  :ensure t
  :config
  (ivy-mode 1))

(use-package counsel
  :ensure t
  :config
  (counsel-mode 1))

(use-package swiper
  :ensure t)

(use-package counsel-projectile
  :ensure t
  :config
  (counsel-projectile-mode 1)
  :bind
  (("C-c pf" . counsel-projectile-find-file)))

;; Magit
(use-package magit
  :ensure t
  :bind (("C-x g" . magit-status)
         ("C-x M-g" . magit-dispatch)))

;; Devdocs
(use-package devdocs
  :ensure t
  :config
  ;; Set the documentation sets you want to use
  (setq devdocs-data-dir "~/.emacs.d/devdocs")
  (setq devdocs-databases
        '("python~3.10" "java~17" "html" "css" "javascript" "c")))

;; Dashboard
(use-package dashboard
  :ensure t
  :config
  (dashboard-setup-startup-hook))
  
;; Set the title
(setq dashboard-banner-logo-title "Welcome to Emacs")
;; Set the banner
(setq dashboard-startup-banner (expand-file-name "~/.emacs.d/ina.png"))
;; Content is not centered by default. To center, set
(setq dashboard-center-content t)
;; vertically center content
(setq dashboard-vertically-center-content t)

;; To disable shortcut "jump" indicators for each section, set
(setq dashboard-show-shortcuts nil)

(setq dashboard-items '((recents   . 5)
                        (agenda    . 5)))

(setq dashboard-startupify-list '(dashboard-insert-banner
                                  dashboard-insert-newline
                                  dashboard-insert-banner-title
                                  dashboard-insert-newline
                                  dashboard-insert-navigator
                                  dashboard-insert-newline
                                  dashboard-insert-init-info
                                  dashboard-insert-items
                                  dashboard-insert-newline
                                  dashboard-insert-footer))
								  
(use-package org
  :ensure t
  :config
  ;; Define the single agenda file
  (setq org-agenda-files (list "~/.emacs.d/agenda.org"))

  ;; Set up Org Agenda keybindings
  (global-set-key (kbd "C-c a") 'org-agenda)

  ;; Customize Org Agenda views
  (setq org-agenda-custom-commands
        '(("c" "Simple agenda view"
           ((agenda "")
            (alltodo "")))))

  ;; Other useful configurations
  (setq org-log-done 'time)  ;; Log the time when a task is marked as done
  (setq org-agenda-span 'week)  ;; Show a week view by default
  (setq org-agenda-start-on-weekday nil)  ;; Start the agenda on the current day
)
