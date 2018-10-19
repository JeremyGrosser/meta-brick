SUMMARY = "brick image"

IMAGE_INGUAS = "en-us"
GLIBC_GENERATE_LOCALES = "en_US.UTF-8"

IMAGE_FEATURES += "package-management"

IMAGE_INSTALL_append = " \
    brick-network-config \
    python3 \
    libgpiod \
    parted \
    kernel-modules \
    systemd-bootchart \
    "

inherit core-image

