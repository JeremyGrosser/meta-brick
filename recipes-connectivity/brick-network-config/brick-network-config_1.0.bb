FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI = " \
    file://usb.network \
    file://COPYING \
"

S = "${WORKDIR}"

LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=e6a75371ba4d16749254a51215d13f97"

do_install_append() {
    install -D -m 0644 ${S}/usb.network ${D}${sysconfdir}/systemd/network/usb.network
}

FILES_${PN} += " \
    ${sysconfdir}/systemd/network \
    "
