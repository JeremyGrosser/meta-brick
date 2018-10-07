SUMMARY = "brick image"

IMAGE_INGUAS = "en-us"
GLIBC_GENERATE_LOCALES = "en_US.UTF-8"

IMAGE_FEATURES += "package-management"

IMAGE_INSTALL_append = "libgpiod"

inherit core-image
