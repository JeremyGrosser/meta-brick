SUMMARY = "brick image"

IMAGE_INGUAS = "en-us"
GLIBC_GENERATE_LOCALES = "en_US.UTF-8"

IMAGE_FEATURES += "package-management"

IMAGE_INSTALL_append = " \
    python3 \
    libgpiod \
    parted \
    kernel-modules \
    "

inherit core-image

